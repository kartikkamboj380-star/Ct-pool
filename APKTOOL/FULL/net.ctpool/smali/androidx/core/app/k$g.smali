.class public Landroidx/core/app/k$g;
.super Landroidx/core/app/k$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/k$g$a;
    }
.end annotation


# instance fields
.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private g:Landroidx/core/app/W;

.field private h:Ljava/lang/CharSequence;

.field private i:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroidx/core/app/W;)V
    .locals 1

    invoke-direct {p0}, Landroidx/core/app/k$h;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/k$g;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/k$g;->f:Ljava/util/List;

    invoke-virtual {p1}, Landroidx/core/app/W;->c()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Landroidx/core/app/k$g;->g:Landroidx/core/app/W;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "User\'s name must not be empty."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/core/app/k$h;->a(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/core/app/k$g;->g:Landroidx/core/app/W;

    invoke-virtual {v0}, Landroidx/core/app/W;->c()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v1, "android.selfDisplayName"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/core/app/k$g;->g:Landroidx/core/app/W;

    invoke-virtual {v0}, Landroidx/core/app/W;->i()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.messagingStyleUser"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v0, "android.hiddenConversationTitle"

    iget-object v1, p0, Landroidx/core/app/k$g;->h:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/core/app/k$g;->h:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/core/app/k$g;->i:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android.conversationTitle"

    iget-object v1, p0, Landroidx/core/app/k$g;->h:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Landroidx/core/app/k$g;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/core/app/k$g;->e:Ljava/util/List;

    invoke-static {v0}, Landroidx/core/app/k$g$a;->a(Ljava/util/List;)[Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.messages"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_1
    iget-object v0, p0, Landroidx/core/app/k$g;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/core/app/k$g;->f:Ljava/util/List;

    invoke-static {v0}, Landroidx/core/app/k$g$a;->a(Ljava/util/List;)[Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.messages.historic"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_2
    iget-object v0, p0, Landroidx/core/app/k$g;->i:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    const-string v1, "android.isGroupConversation"

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    return-void
.end method

.method public b(Landroidx/core/app/j;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/core/app/k$g;->j()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/core/app/k$g;->l(Z)Landroidx/core/app/k$g;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {}, Landroidx/core/app/m;->a()V

    iget-object v0, p0, Landroidx/core/app/k$g;->g:Landroidx/core/app/W;

    invoke-virtual {v0}, Landroidx/core/app/W;->h()Landroid/app/Person;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/app/l;->a(Landroid/app/Person;)Landroid/app/Notification$MessagingStyle;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/app/Notification$MessagingStyle;

    iget-object v2, p0, Landroidx/core/app/k$g;->g:Landroidx/core/app/W;

    invoke-virtual {v2}, Landroidx/core/app/W;->c()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/app/Notification$MessagingStyle;-><init>(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v2, p0, Landroidx/core/app/k$g;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/core/app/k$g$a;

    invoke-virtual {v3}, Landroidx/core/app/k$g$a;->g()Landroid/app/Notification$MessagingStyle$Message;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/Notification$MessagingStyle;->addMessage(Landroid/app/Notification$MessagingStyle$Message;)Landroid/app/Notification$MessagingStyle;

    goto :goto_1

    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    if-lt v2, v3, :cond_2

    iget-object v2, p0, Landroidx/core/app/k$g;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/core/app/k$g$a;

    invoke-virtual {v3}, Landroidx/core/app/k$g$a;->g()Landroid/app/Notification$MessagingStyle$Message;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/core/app/n;->a(Landroid/app/Notification$MessagingStyle;Landroid/app/Notification$MessagingStyle$Message;)Landroid/app/Notification$MessagingStyle;

    goto :goto_2

    :cond_2
    iget-object v2, p0, Landroidx/core/app/k$g;->i:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_4

    :cond_3
    iget-object v2, p0, Landroidx/core/app/k$g;->h:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/app/Notification$MessagingStyle;->setConversationTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$MessagingStyle;

    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_5

    iget-object v1, p0, Landroidx/core/app/k$g;->i:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Landroidx/core/app/o;->a(Landroid/app/Notification$MessagingStyle;Z)Landroid/app/Notification$MessagingStyle;

    :cond_5
    invoke-interface {p1}, Landroidx/core/app/j;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/Notification$Style;->setBuilder(Landroid/app/Notification$Builder;)V

    return-void
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "androidx.core.app.NotificationCompat$MessagingStyle"

    return-object v0
.end method

.method public h(Landroidx/core/app/k$g$a;)Landroidx/core/app/k$g;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/core/app/k$g;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/core/app/k$g;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x19

    if-le p1, v0, :cond_0

    iget-object p1, p0, Landroidx/core/app/k$g;->e:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public i(Ljava/lang/CharSequence;JLandroidx/core/app/W;)Landroidx/core/app/k$g;
    .locals 1

    .line 1
    new-instance v0, Landroidx/core/app/k$g$a;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/core/app/k$g$a;-><init>(Ljava/lang/CharSequence;JLandroidx/core/app/W;)V

    invoke-virtual {p0, v0}, Landroidx/core/app/k$g;->h(Landroidx/core/app/k$g$a;)Landroidx/core/app/k$g;

    return-object p0
.end method

.method public j()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/core/app/k$h;->a:Landroidx/core/app/k$e;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/core/app/k$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v2, 0x1c

    if-ge v0, v2, :cond_1

    iget-object v0, p0, Landroidx/core/app/k$g;->i:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/core/app/k$g;->h:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Landroidx/core/app/k$g;->i:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_2
    return v1
.end method

.method public k(Ljava/lang/CharSequence;)Landroidx/core/app/k$g;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/core/app/k$g;->h:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public l(Z)Landroidx/core/app/k$g;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/k$g;->i:Ljava/lang/Boolean;

    return-object p0
.end method
