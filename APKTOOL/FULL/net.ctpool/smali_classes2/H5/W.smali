.class public final LH5/W;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH5/W;

.field private static final b:LH5/F;

.field private static final c:LH5/F;

.field private static final d:LH5/F;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LH5/W;

    .line 2
    .line 3
    invoke-direct {v0}, LH5/W;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH5/W;->a:LH5/W;

    .line 7
    .line 8
    sget-object v0, LO5/c;->u:LO5/c;

    .line 9
    .line 10
    sput-object v0, LH5/W;->b:LH5/F;

    .line 11
    .line 12
    sget-object v0, LH5/M0;->o:LH5/M0;

    .line 13
    .line 14
    sput-object v0, LH5/W;->c:LH5/F;

    .line 15
    .line 16
    sget-object v0, LO5/b;->p:LO5/b;

    .line 17
    .line 18
    sput-object v0, LH5/W;->d:LH5/F;

    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a()LH5/F;
    .locals 1

    .line 1
    sget-object v0, LH5/W;->b:LH5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b()LH5/F;
    .locals 1

    .line 1
    sget-object v0, LH5/W;->d:LH5/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final c()LH5/B0;
    .locals 1

    .line 1
    sget-object v0, LM5/u;->b:LH5/B0;

    .line 2
    .line 3
    return-object v0
.end method
