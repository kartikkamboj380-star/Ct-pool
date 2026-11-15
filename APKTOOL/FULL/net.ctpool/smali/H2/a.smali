.class public final synthetic LH2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:LH2/b;

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(LH2/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH2/a;->m:LH2/b;

    iput p2, p0, LH2/a;->n:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LH2/a;->m:LH2/b;

    iget v1, p0, LH2/a;->n:I

    invoke-static {v0, v1}, LH2/b;->a(LH2/b;I)V

    return-void
.end method
