.class public final synthetic Lh4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lh4/A;

.field public final synthetic n:J

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lh4/A;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/z;->m:Lh4/A;

    iput-wide p2, p0, Lh4/z;->n:J

    iput-object p4, p0, Lh4/z;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lh4/z;->m:Lh4/A;

    iget-wide v1, p0, Lh4/z;->n:J

    iget-object v3, p0, Lh4/z;->o:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lh4/A;->d(Lh4/A;JLjava/lang/String;)V

    return-void
.end method
