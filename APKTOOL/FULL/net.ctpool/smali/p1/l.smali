.class public final enum Lp1/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/l$a;
    }
.end annotation


# static fields
.field public static final n:Lp1/l$a;

.field private static final o:[Lp1/l;

.field public static final enum p:Lp1/l;

.field public static final enum q:Lp1/l;

.field public static final enum r:Lp1/l;

.field private static final synthetic s:[Lp1/l;


# instance fields
.field private final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lp1/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    const-string v3, "UNKNOWN"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, Lp1/l;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lp1/l;->p:Lp1/l;

    .line 11
    .line 12
    new-instance v0, Lp1/l;

    .line 13
    .line 14
    const-string v1, "VISIBLE"

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, v2, v2}, Lp1/l;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lp1/l;->q:Lp1/l;

    .line 21
    .line 22
    new-instance v0, Lp1/l;

    .line 23
    .line 24
    const-string v1, "INVISIBLE"

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-direct {v0, v1, v2, v2}, Lp1/l;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lp1/l;->r:Lp1/l;

    .line 31
    .line 32
    invoke-static {}, Lp1/l;->e()[Lp1/l;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lp1/l;->s:[Lp1/l;

    .line 37
    .line 38
    new-instance v0, Lp1/l$a;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {v0, v1}, Lp1/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lp1/l;->n:Lp1/l$a;

    .line 45
    .line 46
    invoke-static {}, Lp1/l;->values()[Lp1/l;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lp1/l;->o:[Lp1/l;

    .line 51
    .line 52
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lp1/l;->m:I

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic e()[Lp1/l;
    .locals 3

    .line 1
    sget-object v0, Lp1/l;->p:Lp1/l;

    .line 2
    .line 3
    sget-object v1, Lp1/l;->q:Lp1/l;

    .line 4
    .line 5
    sget-object v2, Lp1/l;->r:Lp1/l;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lp1/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static final synthetic h()[Lp1/l;
    .locals 1

    .line 1
    sget-object v0, Lp1/l;->o:[Lp1/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lp1/l;
    .locals 1

    .line 1
    const-class v0, Lp1/l;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lp1/l;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lp1/l;
    .locals 1

    .line 1
    sget-object v0, Lp1/l;->s:[Lp1/l;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lp1/l;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final j()I
    .locals 1

    .line 1
    iget v0, p0, Lp1/l;->m:I

    .line 2
    .line 3
    return v0
.end method
