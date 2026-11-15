.class public final enum LJ1/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum m:LJ1/b$b;

.field public static final enum n:LJ1/b$b;

.field public static final enum o:LJ1/b$b;

.field private static final synthetic p:[LJ1/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LJ1/b$b;

    .line 2
    .line 3
    const-string v1, "SMALL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LJ1/b$b;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LJ1/b$b;->m:LJ1/b$b;

    .line 10
    .line 11
    new-instance v1, LJ1/b$b;

    .line 12
    .line 13
    const-string v2, "DEFAULT"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, LJ1/b$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LJ1/b$b;->n:LJ1/b$b;

    .line 20
    .line 21
    new-instance v2, LJ1/b$b;

    .line 22
    .line 23
    const-string v3, "DYNAMIC"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, LJ1/b$b;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, LJ1/b$b;->o:LJ1/b$b;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [LJ1/b$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LJ1/b$b;->p:[LJ1/b$b;

    .line 36
    .line 37
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

.method public static valueOf(Ljava/lang/String;)LJ1/b$b;
    .locals 1

    .line 1
    const-class v0, LJ1/b$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LJ1/b$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LJ1/b$b;
    .locals 1

    .line 1
    sget-object v0, LJ1/b$b;->p:[LJ1/b$b;

    .line 2
    .line 3
    invoke-virtual {v0}, [LJ1/b$b;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LJ1/b$b;

    .line 8
    .line 9
    return-object v0
.end method
