.class public final enum Li5/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Li5/j;

.field public static final enum n:Li5/j;

.field public static final enum o:Li5/j;

.field private static final synthetic p:[Li5/j;

.field private static final synthetic q:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li5/j;

    .line 2
    .line 3
    const-string v1, "SYNCHRONIZED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Li5/j;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Li5/j;->m:Li5/j;

    .line 10
    .line 11
    new-instance v0, Li5/j;

    .line 12
    .line 13
    const-string v1, "PUBLICATION"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Li5/j;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Li5/j;->n:Li5/j;

    .line 20
    .line 21
    new-instance v0, Li5/j;

    .line 22
    .line 23
    const-string v1, "NONE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Li5/j;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Li5/j;->o:Li5/j;

    .line 30
    .line 31
    invoke-static {}, Li5/j;->e()[Li5/j;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Li5/j;->p:[Li5/j;

    .line 36
    .line 37
    invoke-static {v0}, Lp5/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Li5/j;->q:Lkotlin/enums/EnumEntries;

    .line 42
    .line 43
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final synthetic e()[Li5/j;
    .locals 3

    .line 1
    sget-object v0, Li5/j;->m:Li5/j;

    .line 2
    .line 3
    sget-object v1, Li5/j;->n:Li5/j;

    .line 4
    .line 5
    sget-object v2, Li5/j;->o:Li5/j;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Li5/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li5/j;
    .locals 1

    .line 1
    const-class v0, Li5/j;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Li5/j;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Li5/j;
    .locals 1

    .line 1
    sget-object v0, Li5/j;->p:[Li5/j;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Li5/j;

    .line 8
    .line 9
    return-object v0
.end method
