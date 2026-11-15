.class public abstract LV2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV2/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()LV2/g;
    .locals 4

    .line 1
    new-instance v0, LV2/b;

    .line 2
    .line 3
    sget-object v1, LV2/g$a;->o:LV2/g$a;

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, LV2/b;-><init>(LV2/g$a;J)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static d()LV2/g;
    .locals 4

    .line 1
    new-instance v0, LV2/b;

    .line 2
    .line 3
    sget-object v1, LV2/g$a;->p:LV2/g$a;

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, LV2/b;-><init>(LV2/g$a;J)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static e(J)LV2/g;
    .locals 2

    .line 1
    new-instance v0, LV2/b;

    .line 2
    .line 3
    sget-object v1, LV2/g$a;->m:LV2/g$a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, LV2/b;-><init>(LV2/g$a;J)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static f()LV2/g;
    .locals 4

    .line 1
    new-instance v0, LV2/b;

    .line 2
    .line 3
    sget-object v1, LV2/g$a;->n:LV2/g$a;

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, LV2/b;-><init>(LV2/g$a;J)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()LV2/g$a;
.end method
