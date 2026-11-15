.class public abstract LO5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public m:J

.field public n:LO5/i;


# direct methods
.method public constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x0

    .line 1
    sget-object v2, LO5/l;->g:LO5/i;

    invoke-direct {p0, v0, v1, v2}, LO5/h;-><init>(JLO5/i;)V

    return-void
.end method

.method public constructor <init>(JLO5/i;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LO5/h;->m:J

    iput-object p3, p0, LO5/h;->n:LO5/i;

    return-void
.end method
