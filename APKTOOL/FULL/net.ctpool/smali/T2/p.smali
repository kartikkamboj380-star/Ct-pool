.class public abstract LT2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT2/p$a;,
        LT2/p$b;
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

.method public static a()LT2/p$a;
    .locals 1

    .line 1
    new-instance v0, LT2/f$b;

    .line 2
    .line 3
    invoke-direct {v0}, LT2/f$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public abstract b()LT2/s;
.end method

.method public abstract c()LT2/p$b;
.end method
